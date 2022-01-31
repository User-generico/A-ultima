import java.util.Scanner;

class Funcionario{
    private String nome;
    private int diaadm;
    private int dinheiroprivado;
    public int i, quantidade = 114, quantidades2 = 11;
    public String Pessoas[][] = {{"0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10"}, {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9""0", "1", "2", "3", "4", "5", "6", "7", "8", "9", "11" ,"15", "17"}};
    public int dinheiro[][] = {{0,1,0,1,2,3,4,5}, {0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9,0,1,2,3,4,5,6,7,8,9}};
    
    Scanner input = new Scanner ( System.in );
    
    public void comeca(String string, int datamimissao, int dinheiross){
        System.out.println("----------------------------------------");
        System.out.println(" ");
        
        for(i = 1; i <= quantidade; i++){
            System.out.println("Informe o nome: ");
            string = input.next();
            this.nome = string;
            Pessoas[0][i] = this.nome;
        }

        System.out.println(" ");

        while(this.quantidade > 100 || this.quantidade < 1){
            System.out.println("Quantos funcionarios nesta empresa? (Máx 100)");
            String q = input.next();
            datamimissao = Integer.parseInt(q);
            this.quantidade = datamimissao;
        }

        System.out.println(" ");
        
        for(i = 0; i <= quantidade; i++){
            System.out.println(" ");
            System.out.println("Informe a data de admissão do funcionário: ");
            String Year = input.next();
            datamimissao = Integer.parseInt(Year);
            this.diaadm = datamimissao;
            dinheiro[0][i] = this.diaadm;
        }

        System.out.println(" ");
            
        for(i = 0; i <= quantidade; i++){
            System.out.println(" ");
            System.out.println("Informe altura: ");
            String Alt = input.next();
            dinheiross = Integer.parseInt(Alt);
            this.dinheiroprivado = dinheiross; 
            dinheiro[1][i] = this.dinheiroprivado;
        }
        
            
    }
    


    public void Imprimir(){
        for(i = 1; i < quantidade; i++){
            System.out.println(" " + Pessoas[i][0] + " ");
        }    
    	System.out.println("");
    	for(i = 1; i < quantidade; i++){
            System.out.println(" " + Pessoas[0][i] + " ");
        }  
        System.out.println("");
        for(i = 1; i < quantidade; i++){
            System.out.println(" " + Pessoas[1][i] + " ");
        }  
    	System.out.println("");
    
    }

//Sets
    public void setNome(){
        this.nome = this.nome;
    }
    
    public void setData(){
        this.diaadm = this.diaadm;
    }
    
    public void setAltura(){
        this.dinheiroprivado = this.dinheiroprivado;
    }


    
//Gets  
    public String getNome(){
        return nome;
    }
    
    public int getData(){
        return diaadm;
    }
    
    public int getSalario(){
        return dinheiroprivado;
    }
    
}





public class Main
{
	public static void main(String[] args) {
		Funcionario F = new Funcionario();
		F.comeca("a", 2, 2);
		F.Imprimir();
	}
}


