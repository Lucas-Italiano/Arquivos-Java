import java.io.*;
import java.nio.channels.FileChannel;
import java.nio.file.Files;


public class Main {
    public static void main(String[] args) throws IOException {
        File source = new File("/home/aluno/Downloads/Projeto/Projeto.iml");
        if (source.exists())
        {
            File destination = new File("/home/aluno/Downloads/");
            boolean success = source.renameTo(new File(destination, source.getName()));
            if (success) {
                System.out.println("Arquivo movido para '" + destination.getAbsolutePath() + "'");
            }else {
                System.out.println("Não foi possivel mover o arquivo '" + source.getAbsolutePath() + "' para '" + destination.getAbsolutePath() + "'");

                }
            }
        }


    }


