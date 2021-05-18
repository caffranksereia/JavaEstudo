import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class FileDiretorio {
    public static void main(String args[]) throws IOException{
        Scanner arquivo =   new Scanner(System.in);
        int count = 0;

        System.out.println("Entra com o diretorio:");


        Path caminho = Paths.get(arquivo.nextLine());
        

        if(Files.exists(caminho)){
            System.out.printf("Nome do arquivo: %s%n",caminho.getFileName());
            System.out.printf("È diretorio %s%n",Files.isDirectory(caminho)? "Sim":"Não");
            System.out.printf("Ultime modificação: %s%n",Files.getLastModifiedTime(caminho));
            System.out.printf("Tamanho:%s%n",Files.size(caminho));
            System.out.printf("Caminho:%s%n",caminho);
            
            if(Files.isDirectory(caminho)) {
            	System.out.printf("Conteudo do diretorio\n");
            	DirectoryStream<Path> directoryStream = Files.newDirectoryStream(caminho);
            	for(Path cam: directoryStream) {
            		System.out.println(cam);
            		
            		
            	}
            	
            }
          }
        	else {
        		System.out.printf("%nO caminho $s não existe.",caminho);
        	}
        }
    }
}