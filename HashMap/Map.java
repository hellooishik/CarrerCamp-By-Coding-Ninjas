/*
package HashMap;
import java.util.ArrayList; 
public class Map<K,V> {
ArrayList <Map<K,V>> buckets;
int count;
int numBuckets;
public Map() {
buckets = new ArrayList<>();
numBuckets = 20;
for(int i=0;i<numBuckets;i++) {
buckets.add(null);
}
}
private int getBucketIndex(K Key) {
int hc = Key.hashCode();
int index = hc%numBuckets;
return index;
}
public void insert (K value,V Value) {
int bucketIndex = getBucketIndex(Key);
HashMapNode<K,V> head = buckets.get(bucketIndex);
//element is not there ? just update its value
while(head! = null) {
if(head.key.equals(key)) {
head.value = value;
return;
}
head = head.next;
}
// element is not there.insert at 0th position of linked list
head = buckets.get(bucketIndex);
MapNode<K,V> head = new MapNode<>(Key,Value);
newNode.next = head;
buckets.set(bucketIndex , newNode);
count++;
}
*/