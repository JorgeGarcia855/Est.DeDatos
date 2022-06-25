/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arbolAVL3;

public class ArbolAVL {
    private final NodoArbolAVL raiz;
    
    public ArbolAVL (){
        raiz=null;
        public NodoArbolAVL obtenerRaiz(){
            return raiz;
        }
    }
    public NodoArbolAVL buscar(int d,NodoArbolAVL r){
        if(raiz==null){
            return null;
        }else if (r.dato==d){
            return r;
        }else if (r.dato<d){
            return buscar(d,r.hijoDerecho);
        }else{
       return buscar(d,r.hijoIzquierdo);
       
        }
    }
    //Obtener el factor de equilibrio
    public int obtenerFE(NodoArbolAVL x){
        if(x==null){
            return -1;
        }else{
            return x.fe;
            
        }
    }
    //Rotacion Simple izquierda
    public NodoArbolAVL rotacionIzquierda (NodoArbolAVL c){
        NodoArbolAVL auxilar=c.hijoIzquierdo;
        c.hijoIzquierdo=auxiliar.hijoDerecho;
        auxiliar.hijoDerecho=c;
        c.fe=Match.max(obtenerFE(c.hijoIzquierdo),obtenerFE(c.hijoDerecho))+1;
        return auxiliar;
                
    }
    //Rotacion simple Derecho
    public NodoArbolAVL rotacionDerecha (NodoArbolAVL c){
        NodoArbolAVL auxilar=c.hijoDerecho;
        c.hijoDerecho=auxiliar.hijoDerecho;
        auxiliar.hijoDerecho=c;
        c.fe=Match.max(obtenerFE(c.hijoIzquierdo),obtenerFE(c.hijoDerecho))+1;
        return auxiliar;
                
    }
    //Rotacion doble ala Derecha
    Public NodoArbolAVL rotacionDobleIzquierda(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.Izquierda=rotacionIzquierd=rotacionDerecha(c.hijoIzquerdo);
        temporal=rotacionIzquierda(c);
        retunr temporal;
        
    }
    //Rotacion doble ala Izquierda
    public NodoArbolAVL rotacionDobleDerecha(NodoArbolAVL c){
        NodoArbolAVL temporal;
        c.hijoDerecho=rotacionizquierda(hijoDerecho);
        temporal=rotacionDerecha(c);
        return temporal;
        
      
    }
    //Metodo para insertar AVL
    public NodoArbolAVL insertarAVL(NodoArbolAVL nuevo,NodoArbolAVL subAr){
      NodoArbolAVL nuevoPadre=subAr;
      nuevo.dato<subAr.dato){
          if(subAr.hijoIzquierdo==null){
              subAr.hijoIzquierdo=nuevo;
          }else{
              subAr.hijoIzquierdo=insertarAVL(nuevo, subAr.hijoIzquierdo);
              if( (obtenerFE(subAr.hijoIzquierdo)- obtenerFE(subAr.hijoDerecho)==2){
                  if(nuevo.dato<subAr.Izquierdo.dato){
                      nuevoPadre=rotacionIzquierda(subAr);
                  }else{
                      nuevoPadre=rotacionDobleIzquierda(usbAr);
                      
                  }
              }
                      
          }
      }else if(nuevo.dato>subAr.dato)
          if(subAr.hijoDerecho==null){
              subAr.hijoDereho=nuevo;
              }else{
              subAr.hijoDerecho=insertarAVL(nuevo,subAr.hijoDerecho);
              if((obtenerFE(subAr.hijoDerecho) - obtenerFE(subAr.hijoIzquierdo)==2)){
              if(nuevo.dato>subAr.hijoDerecho.dato){
              nuevopadre=rotacionDerecha (subAr);
              }else{
              nuevoPadre=rotacionDobleDerecha(subAr);
              
              }
              }
              }
    }else{
    System.out.println("Nodo Duplicado");
}
    //Actualizando la altura
    if((subAr.hijoIzquierdo==null)) && (subAr.hijoDerecho!=null)) {
    subAr.fe=subAr.hijoDereho.fe+1;
}else if ((subAr.hijoDereho==null) && (subAr.hijoIzquierdo!=null)){
        subAr.fe=subAr.hijoIzquierdo.fe+1;
}else{
    subAr.Fe=Math.max(obtenerFE(subAr.hijoIzquierdo),obtenerFE(subAr.hijoDerecho))+1;
}
return nuevoPadre;


    //Metodo para insertar 
    public void insertar(int d){
    NodoArbolAVL nuevo=new NodoArbolAvl (d);
    if (raiz==null){
    raiz=nuevo;
    }else {
    raiz=insertarAVL(nuevo,raiz);
    }
    }
    //Recorridos
    //Inorden
    public void inOrden(NodoArbolAvl r){
    if(r!=null){
    inOrden(r.hijoIzquierdo);
    System.out.print(r.dato + ".");
    inOrden(r.hijoDerecho);

    }
    //Preorden
    public void preOrden(NodoArbolAvl r){
    if(r!=null){
    System.out.print(r.dato + ",");
    preOrden(r.hijoIzquierdo);
    preOrden(r.hijoDerecho);
    }
    }
    //Postorden
    public void postOrden(NodoArbolAvl r){
    if(r!=null){
    postOrden(r.hijoIzquierdo);
    postOrden(r.hijoDerecho);
    System.out.print(r.dato + ",");
         }
      }
}
}
 