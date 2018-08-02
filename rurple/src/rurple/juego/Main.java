package rurple.juego;

public class Main {


}
try ​{   Stream <String> lines = Files.​lines​(
        Paths.​get​(​"/Users/cristopher/workspace/documentos/rurple/src/mapa.txt"​),
        StandardCharsets.​UTF_8
        ​);
        lines.forEach(s -> System.​out​.println(s));
} ​catch ​(IOException exception) {
    System.​out​.println(​"Error!"​);
}
