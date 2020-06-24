package main

import "fmt"
import "os"

func main() {
	fmt.Println("Goodbye World!")
	os.Remove("./goodbye_world.go")
}