class arrayexample{
public static void main(String args[]){
//int [] arr = new int [5];  //new keyword
int [] arr = {10,24,5,48,40,1,3,6}; //array intializer
// System.out.println(arr[11]); //index of array element

for (int i=0;i<arr.length;i=i+2){
	System.out.println(arr[i]);
}

String [] names = {"mam","sam","ram","dam","see","rat","cat","bat","hat"};

for(String a : names){
	System.out.println(a);
}
}
}