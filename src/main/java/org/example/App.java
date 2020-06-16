package org.example;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;
import org.example.model.Action;
import org.example.model.Conditional;

import java.util.ArrayList;
import java.util.List;

/**
 * Java.util.function package
 *
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Functional 26 May" );
Product p1, p2,p3,p4;

p1= new Product("Beans",10,220);
p2 = new Product("Big Family Pack",134,8);
p3 = new Product("Pampers",145,2);
p4 = new Product("Sanitzers",125,0);



        List<Product> items = new ArrayList<>();
items.add(p1);
items.add(p2);
items.add(p3);
items.add(p4);
       // for(Product p: items)            System.out.println(p);
//Conditional conditional = con->con.getStock()==0;
        Action action= System.out::println;

        System.out.println("Part a");
        practice(items, con->con.getStock()==0, action);

//Conditional conditional1 = con->con.getProductName().startsWith("B");
        System.out.println("Part b");
        practice(items, con->con.getProductName().startsWith("B"), action);  // A function call was with VARIED middle parameter i.e. conditional

//Conditional conditional2 = con->con.getPrice()>100;
        System.out.println("Part c");
        practice(items, con->con.getPrice()>100 && con.getPrice()<250, action);

        System.out.println("Part d");
//Conditional conditional4 = con->con.getStock()>0 && con.getStock()<10;
        Action action4= act->act.setPrice(act.getPrice()*1.5);
        practice(items, con->con.getStock()>0 && con.getStock()<10,action4);
        //items.forEach(System.out::println);
    }

    public static void practice(List<Product> items, Conditional condition, Action action){

        for(Product p:items)
            if(condition.test(p))
                action.execute(p);


     //   items.forEach(action.execute());

        // Print out the productName of all the Products that starts with B.
        // for(Product p: items)
        //if(p.getProductName().startsWith("B"))
       // if(isProduct)
            //Action myAction = (Product p)->p.getProductName().startsWith("B");
       // action.execute(p);
        //    System.out.println(p);

    }
}
