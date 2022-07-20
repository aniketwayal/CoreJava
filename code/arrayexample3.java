class arrayexample3{
public static void main(String [] args){
int a [] = {10,20,3,9,8,96,1,30,45};
System.out.println("odd number");
for (int i =0; i <a.length; i++){
if (a[i]%2!=0){
System.out.println(a[i]);
}
}
System.out.println("even number");
for (int i =0; i <a.length; i++){
if (a[i]%2==0){
System.out.println(a[i]);
}
}

}
}