#include "BinaryTree.h"
#include <iostream>

int main() 
{
    BinaryTree tree;
    tree.add(5);
    tree.add(3);
    tree.add(7);
    tree.add(2);
    tree.add(4);
    tree.add(6);
    tree.add(8);
    tree.add(1);
    std::vector<int> list = tree.preOrderTraversal();
    for (int i = 0; i < list.size(); i++)
    {
        std::cout << list[i] << " ";
    }
    std::cout << std::endl;
    return 0;
}