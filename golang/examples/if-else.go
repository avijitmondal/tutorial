package main

import "fmt"

func main() {

	i := 5
	if i%2 == 0 {
		fmt.Println(i, " is even")
	} else {
		fmt.Println(i, " is odd")
	}

	// Reassign i
	if i := 7; i < 0 {
		fmt.Println(i, "is negative")
	} else if i < 10 {
		fmt.Println(i, " is a single digit")
	} else {
		fmt.Println(i, " has more than one digit")
	}
}
