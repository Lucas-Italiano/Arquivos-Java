import java.io.*;
import java.nio.channels.FileChannel;

public class copy {
    public static void main(String[] args) throws IOException {
        File src = new File("/home/aluno/Downloads/Projeto/Projeto.txt");
        File dst = new File("/home/aluno/Documentos/arquivo.txt");
        if (dst.exists())
            dst.delete();
        FileChannel sourceChannel = null;
        FileChannel destinationChannel = null;

        try {
            sourceChannel = new FileInputStream(src).getChannel();
            destinationChannel = new FileOutputStream(dst).getChannel();
            sourceChannel.transferTo(0, sourceChannel.size(),
                    destinationChannel);

        }catch (FileNotFoundException e){
            System.out.println("Arquivo ou diretório inexistente");
        }
        finally {
            if (sourceChannel != null && sourceChannel.isOpen())
                sourceChannel.close();
            if (destinationChannel != null && destinationChannel.isOpen())
                destinationChannel.close();
        }
    }
}
