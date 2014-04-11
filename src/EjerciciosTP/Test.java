package EjerciciosTP;

import EjerciciosTP.ListaTuplas;
import EjerciciosTP.Promocion;
import EjerciciosTP.Tupla;

public class Test {
//	public static void test1(){
//		Tupla<String,Integer> precio1 = new Tupla<String,Integer>("Silla",50);
//		Tupla<String,Integer> precio2 = new Tupla<String,Integer>("Mesa",100);
//		Tupla<String,String> materiales1 = new Tupla<String,String>("Silla","Mesa");
//		
//		ListaTuplas<String,Integer> listaPrecios = new ListaTuplas<String,Integer>();
//		listaPrecios.agregar(precio1);
//		listaPrecios.agregar(precio2);
//		
//		ListaTuplas<String,String> listaMateriales = new ListaTuplas<String,String>();
//		listaMateriales.agregar(materiales1);
//		
//		//System.out.println("precio de Mesa:" + listaPrecios.buscar("Mesa").toString());
//		//precio de Mesa:2
//		//System.out.println(listaPrecios.toString());
//		//<Silla,1>
//		//<Mesa,2>
//		//System.out.println(listaMateriales.toString());
//		//<Silla,Mesa>	
//		
//	}
	
	public static void test2(){
		ListaTuplas<String,String> listaMaterialesTEST = new ListaTuplas<String,String>();
		
		listaMaterialesTEST.agregar(new Tupla<String,String>("Puerta","Ladrillo"));
		listaMaterialesTEST.agregar(new Tupla<String,String>("Columna","Ventana"));
		listaMaterialesTEST.agregar(new Tupla<String,String>("Escalera","Cisterna"));
		
		ListaTuplas<String,Integer> listaPreciosTEST = new ListaTuplas<String,Integer>();
		//Basicamente esta seria la lista :3
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Puerta",20));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Ladrillo",10));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Columna",300));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Ventana",60));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Escalera",200));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Cisterna",400));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Chupetin",4));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Birra",18));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("Coca",20));
		listaPreciosTEST.agregar(new Tupla<String,Integer>("PC",4000));
		
		Promocion promocion = new Promocion(listaMaterialesTEST, listaPreciosTEST);
		
		System.out.println(promocion.listaNueva());
		
				
	}
	
//	public static void test3(){
//		ListaTuplas<String,String> lMat = new ListaTuplas<String,String>();
//		ListaTuplas<String,Integer> lPre = new ListaTuplas<String,Integer>();
//		
//		Integer j = 0;
//		for (Integer i = 0; i < 100; i=i+2){
//			j = i+1;
//			lMat.agregar(new Tupla<String,String>("M" + i.toString(),"M" +j.toString()));
//		}
//	
//		for (Integer i = 0; i < 100; i++){
//			lPre.agregar(new Tupla<String,Integer>("M" +i.toString(),i));
//		}
//		
//		//System.out.println(lPre.toString());
//		//System.out.println(lMat.toString());
//		
//		Promocion promocion = new Promocion(lMat, lPre);
//		
//		System.out.println(promocion.toString());
//		
//	}
	
	public static void main(String[] args) {
//		test1();
		test2();
//		test3();
		
	}

}
