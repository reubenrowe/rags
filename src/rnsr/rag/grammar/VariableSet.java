package rnsr.rag.grammar;

import java.util.Hashtable;

public	class		VariableSet
		extends		Hashtable<Variable, Polynomial>
{

	public void put(Variable v)
	{
		if (!this.containsKey(v))
		{
			this.put(v, new Polynomial());
		}
	}
}