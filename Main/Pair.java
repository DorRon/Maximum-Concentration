public class Pair<K,V>
{
	private K key;
	private V value;

	public Pair(K pKey, V pValue)
	{
		setKey(pKey);
		setValue(pValue);
	}

	public void setKey(K pKey)
	{
		key = pKey;
	}

	public K getKey()
	{
		return key;
	}

	public void setValue(V pValue)
	{
		value = pValue;
	}

	public V getValue()
	{
		return value;
	}
}
