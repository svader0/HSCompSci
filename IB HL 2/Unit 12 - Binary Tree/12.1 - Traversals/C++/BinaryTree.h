#ifndef BINARY_TREE
#define BINARY_TREE

#include <vector>
#include <string>

class BinaryTree
{
private:
   struct Node
   {
      int data;
      Node* left;
      Node* right;
   };
   Node* root;

public:
   BinaryTree();
   void add(int item);
   void add(Node* tree, int item);
   std::vector<int> preOrderTraversal();
   void preOrderTraversal(Node* tree, std::vector<int>& list);
   std::vector<int> inOrderTraversal();
   void inOrderTraversal(Node* tree, std::vector<int>& list);
   std::vector<int> postOrderTraversal();
   void postOrderTraversal(Node* tree, std::vector<int>& list);
   std::string toString(Node* root, int level);
   std::string toString();

};

#endif