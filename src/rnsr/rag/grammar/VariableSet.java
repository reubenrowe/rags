package rnsr.rag.grammar;

import java.util.Hashtable;

public	class		VariableSet
		extends		Hashtable<Variable, Polynomial>
{

	private int count = 0;

	public void put(Variable v)
	{
		if (!this.containsKey(v))
		{
			this.put(v, new Polynomial());
			v.setID(++count);
		}
	}

	@Override
	public Polynomial put(Variable v, Polynomial p) {
		if (!this.containsKey(v)) v.setID(++count);
		super.put(v, p);
		return p;
	}

	public void putAll(VariableSet vs) {
		for (Variable v: vs.keySet()) put(v, vs.get(v));
	}

	public String toString() {
		StringBuilder sb = new StringBuilder();

		sb.append("{");
		int count = 0;
		for (Variable v: this.keySet()) {

			//String s = (!this.get(v).onlyLambda() ? this.get(v).toString() : "#");
			String s = (this.get(v) == null || this.get(v).Empty()) ? "" : (this.get(v).onlyLambda() ? " -> #" : " -> " + this.get(v).toString());
			sb.append(v + s);
			if (count++ < this.size() - 1) sb.append(", ");
		}
		sb.append("}");
		return sb.toString();
	}

}