# Adjacency Matrix File Reader for Unweighted Graphs using Dijkstra Algorithm

An Adjacency Matrix File reader for un-weighted graphs using the BFS method and Dijkstra algorithm.

## Usage

1. Instantiate a new `Dijkstra` object.
2. Call `readStrings` method and pass in the file path of the adjacency matrix file.
3. Call `findShortestPathsBFS` method and pass in the starting node and ending node as parameters.

## Example

```java
Dijkstra dijkstra = new Dijkstra();
dijkstra.readStrings("path/to/file.txt");
dijkstra.findShortestPathsBFS(0, 4);
```

## Description

The `findShortestPathsBFS` method will print the shortest path from the starting node to the ending node, if one exists. If no path exists, the method will print "No path exists".

## Example Input File

The input file should be a plain text file containing the adjacency matrix representation of the graph. Each row of the matrix should be on a separate line, with values separated by spaces. For example, the following file represents a graph with 6 nodes:
```agsl
0 1 0 0 1 0
1 0 1 0 1 1
0 1 0 1 0 0
0 0 1 0 1 0
1 1 0 1 0 1
0 1 0 0 1 0
```
