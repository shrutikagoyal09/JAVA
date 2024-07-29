//ARRAYS:-

//to store multiple values in a single variable, array is used.

//SYNTAX
// datatype[] array_name = new datatype[size];

//datatype[] array_name -> this is the declaration of array. datatype represents the type
//                         of data that array will contain. array_name gets defined in the
//                         stack memory. all this happens at compile time.
//new datatype[size] = this is the initialisation of array.object is being created in the
//                     heap memory. memory allocation happens at the runtime.new is used
//                     to create the object.
//This is known as dynamic memory allocation.

//all the primitive(that cannot be further divided like int, char, bool, float) datatype
// are stored in stack memory while other objects of type string,arrays etc. are stored in
// heap memory.

//INTERNAL WORKING OF INT ARRAY
//for eg- int[] arr = new int[5];
// here arr is the reference variable.
//[12,34,54,2,66] = this is the array object.
//whenever the arr needs any value it points at [12,34,54,2,66].
//in other languages like C/C++,  continuous blocks of memory are allocated when an
// array is created. but in java this does not happen. array object in java may not be
// allocated continuous memory because of these following reasons-
//1. array objects are in heap.
//2. heap objects are not continuous.
//3. dynamic memory allocation
//It depends on JVM whether continuous memory is allocated to array or not in java.


//if an empty array of x size is create i.e. int[] arr = new int[5], then by default
// each index will contain value 0. for eg-  arr[1] = 0

//an empty array of type string shows null.


//INTERNAL WORKING OF STRING ARRAY.
//for eg- string[] arr = new string[5];
//Suppose arr(reference variable) is in the stack memory and the array [_,_,_,_,_] is in
// heap memory. reference variable arr in the stack points at [_,_,_,_,_] in the heap
// memory. each element of the string array is itself an object and each object is
// allocated memory in different parts of the memory.




//to print a primitive array
// int[] arr = new int[5];
// for(int i=0; i<arr.length; i++){
//      arr[i] = input.next();
//      }
//for(int i=0; i<arr.length; i++){
//   System.out.println(arr[i]);
//   }

//        or
//for(int val: arr){
//   arr[i] = input.next();
//   }
//for(int val: arr){
//   System.out.println(Arrays.toString(arr));
//   }

//** .toString is a feature that takes array input as a string and print that string in
// the form of array.


//to print an object type array
// string[] arr = new string[5];
//for(int i=0; i<arr.length; i++){
//    arr[i] = input.next();
//   }
//for(int i=0; i<arr.length; i++){
//    System.out.println(Arrays.toString(arr));
//   }



//In JAVA, arrays show mutable behaviour while strings does not show mutable behaviour.
//that means if two functions are pointing at an array and any one function makes changes
// in that array then those changes are made for another function also which is pointing
// at that array.
//For eg- public static void main(String[] args){
//          int[] num = {3,4,5,6};
//          System.out.println(Arrays.toString(num));
//          change(num);
//          System.out.println(Arrays.toString(num));
//          }
//          public static void change(int[] arr){
//          arr[0] = 99;
//          }

//in this example, arr and num are pointing at same array. when arr is making changes in
// the array, those changes will occur for num as well and this behaviour is known as
// mutable behaviour.


//2D ARRAYS:-
//   2d arrays looks like matrices.
//   2d array representation-
//   1 2 3
//   4 5 6
//   7 8 9
//   the above matrix is a 2d array of size 3*3.

// SYNTAX OF 2D ARRAYS -
// int[][] arr = new int[3][];
//the first bracket represents rows and second bracket represents column.
//it is mandatory to mention the size of rows but not columns.

//or
//int[][] arr = {
//      {1,2,3},    //index 0
//      {4,5},      //index 1
//      {6,7,8,9}   //index 2
//    }
//here each index of the array represents an individual array. each individual array has
// different size that's why it is not mandatory to mention the size of columns. it can
// also be called as array of arrays.



//MEMORY MANAGEMENT OF 2D ARRAYS -
//arr is a reference variable which is stored in stack memory and the array with values
// is stored in heap memory. the size of the array is 3 as number of rows are 3. so at
// each index, there is an array of different size. at index 0, an array of size 3 is
// stored. at index 1, an array of size 2 is stored. At index 2 , an array of size 4 is
// stored. all these arrays are stored in different parts of the heap memory. 2d array
// count its indexes with number of rows that's why it is important to mention the
// number of rows while declaring the array.
//arr.length gives number of rows.


//INPUT OF 2D ARRAY -
//     int[][] arr = new int[3][];
//     for(int row =0; row < arr.length; row++){
//         for(int col = 0; col < arr[row].length; col++){
//              arr[row][col] = input.nextInt();
//         }
//     }

//OUTPUT OD 2D ARRAY -
//     for(int row =0; row < arr.length; row++){
//         for(int col = 0; col < arr[row].length; col++){
//              System.out.println(arr[row][col]);
//         }
//     }

//    or
//for(int row =0; row< arr.length; row++){
//    System.out.println(Arrays.toString(arr[row]));
//   }

//   or
//for(int[] a: arr){
//   System.out.println(Arrays.toString(a));
//   }



//ARRAY LIST -
//SYNTAX
// ArrayList<Integer> list = new ArrayList<Integer>(Size);
//To add an item in an arraylist -
//list.add(1);
//list.add(2);
//list.add(3);
//list.add(4);
//System.out.println(list);
//list.set(0,99);  this is used to change the value at index
//list.remove(2); is used to remove value at index 2.


//Multidimensional arraylist -
//SYNTAX
//ArrayList<ArrayList<Integer>> list = new ArrayList<>();
//INITIALISATION-
//for(int i=0; i< 3; i++){
//   list.add(new ArrayList<>());
//   }

//ADD ELEMENTS -
//for(int i=0; i<3; i++){
//  for(int j=0; j<3; j++){
//   list.get(i).add(in.nextInt());
//  }
//}
//System.out.println(list);




