package main

import "fmt"

func main() {

	var a [5]int
	fmt.Println("A with default value: ", a)

	a[4] = 100
	fmt.Println("Inserted into index: ", a)
	fmt.Println("At Index: ", a[4])

	fmt.Println("Length: ", len(a))

	b := [5]int{1, 2, 3, 4, 5}
	fmt.Println("direct insert: ", b)
}
