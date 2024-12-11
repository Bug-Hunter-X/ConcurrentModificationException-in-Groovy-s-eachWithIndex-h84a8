# Groovy ConcurrentModificationException in eachWithIndex
This example demonstrates a common error when using Groovy's `eachWithIndex` method to iterate over a list while modifying it.  Attempting to remove an element within the loop leads to a `ConcurrentModificationException`.

The `bug.groovy` file shows the problematic code. The `bugSolution.groovy` file offers a corrected approach using an iterator or a copy of the list.

This repository serves as a concise illustration of this pitfall and a clear solution.