package Main,
public class Ejercicio3{
    public Ejercicio3(){

        Scanner teclado =new Scanner(System.in);
int nota=0;
int entrada=0;
while(true){
    System.out.println("¿Nota?");
    try{
        entrada=teclado.nectInt();
        
    }catch(InputMismatchException e){
        teclado.next();
    }
    if(entrada==-1){
        break;
    }else{
        nota+=entrada;
    }
}




    }
}