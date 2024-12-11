```groovy
def myMethod(list) {
  list.eachWithIndex { item, index ->
    println "Item: $item, Index: $index"
    if (item == 3) {
      list.remove(item) // This is the problematic line
    }
  }
}

def main() {
  def myList = [1, 2, 3, 4, 5]
  myMethod(myList)
}
```