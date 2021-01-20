package rnsr.rag.grammar;

import java.util.Hashtable;

public	class		VariableSet
		extends		Hashtable<Variable, Polynomial>
{

	public void put(Variable v)
	{
		//if (!this.containsKey(v))
		//{
			v.setIndex(this.size());
			this.put(v, new Polynomial());
		//}
	}

	public void putAll(VariableSet otherSet) {
		for (Variable v: otherSet.keySet()) {
			this.put(v);
		}
	}

	public String toString() {
		//System.out.println("A var set for set size: " + varCount);
		StringBuilder sb = new StringBuilder();
		//Variable[] vars = new Variable[varCount];
		//for (Variable v: this.keySet()) System.out.println(v.getIndex());
		//for (Variable v: this.keySet()) vars[v.getIndex()] = v;
		sb.append("{");
		for (Variable v: keySet()) sb.append(v + ", ");
		//for (int i = 0; i < varCount; i++) sb.append("v" + i);
		sb.append("}");
		return sb.toString();
	}

}
