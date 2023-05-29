package lab5;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Main {
	public static void main(String[] args) {
        String code = "int main(){\n" +
                      "    int x;\n" +
                      "    int y;\n" +
                      "    x = 5;\n" +
                      "    y = 6;\n" +
                      "}";
        Program prog = parseCode(code);
        System.out.println("Program Output:::");
        System.out.println(prog);
    }

    private static Program parseCode(String code) {
        Program prog = new Program();
        List<Declaration> declarations = new ArrayList<>();
        List<Assignment> statements = new ArrayList<>();
        Scanner scanner = new Scanner(code);
        Pattern declarationPattern = Pattern.compile("^\\s*(int|char|double|float|long|short)\\s+([a-zA-Z_][a-zA-Z0-9_]*)\\s*;.*");
        Pattern assignmentPattern = Pattern.compile("^\\s*([a-zA-Z_][a-zA-Z0-9_]*)\\s*=\\s*(.*);.*");
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Matcher declarationMatcher = declarationPattern.matcher(line);
            if (declarationMatcher.matches()) {
                String type = declarationMatcher.group(1);
                String name = declarationMatcher.group(2);
                Declaration decl = new Declaration(type, name);
                declarations.add(decl);
            } else {
                Matcher assignmentMatcher = assignmentPattern.matcher(line);
                if (assignmentMatcher.matches()) {
                    String target = assignmentMatcher.group(1);
                    String source = assignmentMatcher.group(2);
                    Assignment assign = new Assignment(target, source);
                    statements.add(assign);
                }
            }
        }
        scanner.close();
        prog.declarations.addAll(declarations);
        prog.statements.addAll(statements);
        return prog;
    }
}
