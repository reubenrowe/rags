package rnsr.rag.grammar;

import java.util.HashMap;

/**
 * Represents the mappings between the context of one configuration and another, for use in cloning
 */
public	class ContextMapping {

	/**
	 * Map from old variable to new variable
	 */
	private HashMap<Variable, Variable> variableMapping = new HashMap<>();

	/**
	 * Map from old query ID to new query ID
	 */
	private HashMap<Integer, Integer> queryMapping = new HashMap<>();

	public void putVariableMapping(Variable v1, Variable v2) {
		variableMapping.put(v1, v2);
	}

	public void putQueryMapping(int a, int b) {
		queryMapping.put(a, b);
	}

	public boolean containsVariable(Variable v1) {
		return variableMapping.containsKey(v1);
	}

	public Variable getVariableMapping(Variable v1) {
		return variableMapping.get(v1);
	}

	public int getQueryMapping(int a) {
		if (!queryMapping.containsKey(a)) return -1;
		return queryMapping.get(a);
	}

	public boolean containsQuery(int a) {
		return queryMapping.containsKey(a);
	}

}
