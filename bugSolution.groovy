```groovy
def myMethod(list) {
  def iterator = list.iterator()
  while (iterator.hasNext()) {
    def item = iterator.next()
    println "Item: $item, Index: ${list.indexOf(item)}"
    if (item == 3) {
      iterator.remove()
    }
  }
}

def main() {
  def myList = [1, 2, 3, 4, 5]
  myMethod(myList)
}
```