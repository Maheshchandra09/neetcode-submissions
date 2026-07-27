class TimeMap {
    Map<String, TreeMap<Integer,String>> tmp; 
    public TimeMap() {
        tmp = new HashMap();
    }
    
    public void set(String key, String value, int timestamp) {
        tmp.putIfAbsent(key, new TreeMap<>());
        tmp.get(key).put(timestamp, value);
    }
    
    public String get(String key, int timestamp) {
        if (!tmp.containsKey(key)) {
            return "";
        }
        
        TreeMap<Integer, String> timeHistory = tmp.get(key);
        
        Integer exactOrPrevTime = timeHistory.floorKey(timestamp);
        
        if (exactOrPrevTime == null) {
            return "";
        }
        
        return timeHistory.get(exactOrPrevTime);
    }
}
