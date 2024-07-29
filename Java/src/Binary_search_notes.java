// CEILING - Smallest element in the array greater than or equal to target.
//for eg- arr= {2, 3 ,4,5,6,9,13,46,78}
//target = 12
//ceiling(arr,target) = 13 because the target is 12 and smallest element in the array that is greater than or
// equal to target is 13.
//target = 9
//ceiling(arr,target) = 9
//when the given array is sorted than binary search is performed. when the while condition start<=end is
// violated, start = end+1, return start as ceiling of the array.





// FLOOR - Greatest element in the array smaller than or equal to target.
//for eg- arr= {2, 3 , 4, 5, 6, 9, 13, 46, 78}
//target = 12
//floor(arr,target) = 9 because the target is 12 and greatest element in the array that is smaller than or
// equal to 12 is 9.
//target = 9
//ceiling(arr,target) = 9
//when the given array is sorted than binary search is performed. when the while condition start<=end is
// violated, start = end+1, return end as floor of the array.








//**BINARY SEARCH IN 2D ARRAY***
// If you are given a 2D matrix that is row-wise sorted and column-wise sorted then binary search should be
// applied.
// for eg-
// 10,20,30,40
// 15,25,35,45
// 28,29,37,49
// 33,34,48,50
//the matrix is sorted row-wis and column-wise.
//target = 37
//start = 10 and end = 40
// first we will check with 40, if 40 is greater than target that means all the elements in that column will
// be greater than target.So ww will eliminate that column by doing end--.
//then the matrix will get reduced to-
// 10,20,30
// 15,25,35
// 28,29,37
// 33,34,48
//now the value of end will be 30.30 is less than target that means all the elements before 30 will be less
// than target. so we will increase the value of start by doing start++ .
//the target will get reduced to-
// 15,25,35
// 28,29,37
// 33,34,48
//now start is 1 and end is 2 so target will get compared with 35. 35 is less than target that means start++.
// now start = 2 and end = 2.
// 37 == 37 so target is found.
