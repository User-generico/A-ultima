import java.util.Scanner;

class Pessoa{
    private String Nome;
    private int datanascimento;
    private double tamanho;
    public int Qtd = 11, i;
    public String listanome[] = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    public int vetrodata[] = {0,1,2,3,4,5,6,7,8,9};
    public double vetortam[] = {0,1,2,3,4,5,6,7,8,9}; 
    
    Scanner input = new Scanner ( System.in );
    
    public void comeca(String N, int DN, double A){
        System.out.println("----------------------------------------");
        System.out.println(" ");
        while(this.Qtd > 10 || this.Qtd < 1){
            System.out.println("Quantas pessoas nesta agenda? (Máx10)");
            String q = input.next();
            DN = Integer.parseInt(q);
            this.Qtd = DN;
        }
        System.out.println(" ");
        for(i = 0; i < Qtd; i++){
            
            System.out.println("Informe o nome: ");
            N = input.next();
            this.Nome = N;
            System.out.println(" ");
            System.out.println("Informe data de nascimento: ");
            String Year = input.next();
            DN = Integer.parseInt(Year);
            this.datanascimento = DN;
            CalculaIdade();
            vetrodata[i] = this.datanascimento;
            System.out.println(" ");
            System.out.println("Informe a altura: ");
            String Alt = input.next();
            int Altur = Integer.parseInt(Alt);
            A = new Double(Alt);
            A = A / 100;
            this.tamanho = A;
            vetortam[i] = this.tamanho;
            listanome[i] = this.Nome;
            System.out.println(" ");
            mostrar();
            
        }
    }
    
    public void CalculaIdade(){
        this.datanascimento = 2022 - this.datanascimento;
    }

    public void mostrar(){
        System.out.println("Nome: " + this.Nome);
    	System.out.println("");
    	System.out.println("Data de Nascimento: " + this.datanascimento);
    	System.out.println("");
    	System.out.println("tamanho: " + this.tamanho);
    	System.out.println("");
    
    }

//Sets
    public void setNome(){
        this.Nome = this.Nome;
    }
    
    public void setData(){
        this.datanascimento = this.datanascimento;
    }
    
    public void setAltura(){
        this.tamanho = this.tamanho;
    }


    
//Gets  
    public String getNome(){
        return Nome;
    }
    
    public int getData(){
        return datanascimento;
    }
    
    public Double getAltura(){
        return tamanho;
    }
    
}


class Agenda extends Pessoa{
    
    public int compara;
    
    public void armazenaPessoa(String N, int DN, double A){
        comeca("A", 1, 2.1);
    }
    
    public void removePessoa(String N){
        System.out.println("");
        System.out.println("Insira o nome da pessoa que você deseja remover da agenda:");
        N = input.next();
        for(i = 0; i < Qtd; i++){
            compara = N.compareTo(listanome[i]);
            if(compara == 0){
                listanome[i] = null;
                i = Qtd;
            }else{
                if(i == Qtd){
                    System.out.println("Desculpe, essa pessoa não existe na agenda.");
                }
                
            }
        }
        
    }
    
    public int buscaPessoa(String N){
        System.out.println("");
        System.out.println("Por quem você procura?");
        N = input.next();
        for(i = 0; i < Qtd; i++){
            compara = N.compareTo(listanome[i]);
            if(compara == 0){
                System.out.println(listanome[i] + " está na posição: " + i);
                i = Qtd;
            }else{
                if(i+1 == Qtd && compara != 0){
                    System.out.println("Desculpe, essa pessoa não existe na agenda.");
                }
            }
        }
        return i;
    }
    
    public void imprimeAgenda(){
        for(i = 0; i < Qtd; i++){
            System.out.println("Nome: " + this.listanome[i]);
        }
    }
    
    public void imprimePessoa(int index){
        System.out.println("Você quer ver a pessoa de qual posição?");
        String numero = input.next();
        index = Integer.parseInt(numero);
        System.out.println(" ");
        System.out.println("Nome: " + listanome[index]);
        System.out.println("Data: " + vetrodata[index]);
        System.out.println("tamanho: " + vetortam[index]);
    }
    
}


public class Main
{
	public static void main(String[] args) {
		Pessoa P = new Pessoa();
		Agenda Ag = new Agenda();
		Ag.armazenaPessoa("A", 1, 2.1);
		Scanner inserircase = new Scanner ( System.in );
		
		while(true){
		    System.out.println("");
    		System.out.println("Como deseja operar a sua agenda? ");
    		System.out.println("Aperte 1 para remover uma pessoa.");
    		System.out.println("Aperte 2 para buscar uma pessoa.");
    		System.out.println("Aperte 3 para visualizar as pessoas da sua agenda.");
    		System.out.println("Aperte 4 para ver os dados específicos de uma pessoa.");
    		System.out.println("Aperte 5 para sair.");
    		
    		String operacao = inserircase.next();
    		int operar = Integer.parseInt(operacao);
        	    switch(operar){
        	        case 1:
        	            Ag.removePessoa("Bernadete");
        	            System.out.flush();
        	            break;
        	        case 2:
        	            Ag.buscaPessoa("Ilma");
        	            System.out.flush();
        	            break;
        	        case 3:
        	            Ag.imprimeAgenda();
        	            System.out.flush();
        	            break;
        	        case 4:
        	            Ag.imprimePessoa(1);
        	            System.out.flush();
        	            break;
        	        case 5:
        	            System.exit(0);
        	            break;
        	    }  
    		
    	}
	}
}
