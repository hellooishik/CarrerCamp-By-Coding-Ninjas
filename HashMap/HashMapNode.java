package HashMap;

public class HashMapNode<K, V> {
	K key;
	V value;
	HashMapNode<K,V> next;
	
	// Constator
	public HashMapNode(K key, V value) {
		this.key = key;
		this.value = value;
	}
	
}
