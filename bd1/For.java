package bd1;
public class For {
	private String variableDeclarationSection;
    private String loopTerminationCondition;
    private String parameterChangeSection;

    public For(String variableDeclarationSection, String loopTerminationCondition, String parameterChangeSection) {
        this.variableDeclarationSection = variableDeclarationSection;
        this.loopTerminationCondition = loopTerminationCondition;
        this.parameterChangeSection = parameterChangeSection;
    }

    public String toString() {
        return String.format("for (%s; %s; %s)", variableDeclarationSection, loopTerminationCondition, parameterChangeSection);
    }
}

