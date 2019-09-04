public class HashMapProj {

    class Entry {
        private int key;
        private long value;

        public Entry(int key, long value) {
            this.key = key;
            this.value = value;
        }

        public void setValue(long value) {
            this.value = value;
        }

        public int getKey() {
            return key;
        }

        public long getValue() {
            return value;
        }

    }

    private Entry[] buckets;
    private int INITIAL_CAPACITY;
    private int size = 0;

    public HashMapProj(int capacity) {
        this.INITIAL_CAPACITY = capacity;
        this.buckets = new Entry[capacity];
    }

    public void put(int key, long value) {
        Entry entry = new Entry(key, value);
        int bucket = key % INITIAL_CAPACITY;

        while(bucket < INITIAL_CAPACITY){
            if(buckets[bucket] == null || buckets[bucket].getKey()==key){
                break;
            }
            bucket++;
        }
        if(bucket < INITIAL_CAPACITY){
            if(buckets[bucket] == null){
                buckets[bucket] = entry;
                size++;
            }else
                buckets[bucket].setValue(value);

        }
    }
    public long get(int key){
        int bucket = key % INITIAL_CAPACITY;

        while(bucket < INITIAL_CAPACITY && buckets[bucket] != null){
            if(buckets[bucket].getKey()==key){
               return buckets[bucket].getValue();
            }
            bucket++;
        }
        return 0;
    }

    public int size() {
        return size;
    }


}

