class TokenRing { 
int numNodes; 
String[] nodes; 
// Constructor 
public TokenRing(int numNodes) { 
this.numNodes = numNodes; 
nodes = new String[numNodes]; 
} 
// Set node data 
public void setNode(int nodeId, String data) { 
nodes[nodeId] = data; 
} 
// Token Ring Algorithm 
public void run() { 
String token = java.util.Arrays.toString(nodes); 
int currentNode = 0; 
while (true) { 
if (token != null) { 
System.out.println("Node " + currentNode + 
": Received token with data '" + token + "'"); 
System.out.println("Node " + currentNode + 
": Processing data '" + nodes[currentNode] + "'"); 
} 
int nextNode = (currentNode + 1) % numNodes; 
token = nodes[nextNode]; 
nodes[nextNode] = null; 
if (currentNode == 0 && token == null) { 
break; 
} 
currentNode = nextNode; 
} 
} 
// Main Method 
public static void main(String[] args) { 
TokenRing tokenRing = new TokenRing(4); 
tokenRing.setNode(0, "Data 1"); 
tokenRing.setNode(1, "Data 2"); 
tokenRing.setNode(2, "Data 3"); 
tokenRing.setNode(3, "Data 4"); 
tokenRing.run(); 
} 
}