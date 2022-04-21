#include "BinaryTree.h"

BinaryTree::BinaryTree() 
{
    root = nullptr;
}

void BinaryTree::add(int item) 
{
    if (root == nullptr) 
    {
        root = new Node;
        root->data = item;
        root->left = nullptr;
        root->right = nullptr;
    }
    else 
    {
        add(root, item);
    }
}

void BinaryTree::add(Node* tree, int item) 
{
    if (item < tree->data)
    {
        if (tree->left == nullptr) 
        {
            tree->left = new Node;
            tree->left->data = item;
            tree->left->left = nullptr;
            tree->left->right = nullptr;
        }
        else 
        {
            add(tree->left, item);
        }
    }
    if (item > tree->data) 
    {
        if (tree->right == nullptr) 
        {
            tree->right = new Node;
            tree->right->data = item;
            tree->right->left = nullptr;
            tree->right->right = nullptr;
        }
        else 
        {
            add(tree->right, item);
        }
    }
}

std::vector<int> BinaryTree::preOrderTraversal() 
{
    std::vector<int> list;
    preOrderTraversal(root, list);
    return list;
}

void BinaryTree::preOrderTraversal(Node* tree, std::vector<int>& list) 
{
    if (tree != nullptr)
    {
        list.push_back(tree->data);
        preOrderTraversal(tree->left, list);
        preOrderTraversal(tree->right, list);
    }
}

std::vector<int> BinaryTree::inOrderTraversal() 
{
    std::vector<int> list;
    inOrderTraversal(root, list);
    return list;
}

void BinaryTree::inOrderTraversal(Node* tree, std::vector<int>& list) 
{
    if (tree != nullptr) 
    {
        inOrderTraversal(tree->left, list);
        list.push_back(tree->data);
        inOrderTraversal(tree->right, list);
    }
}

std::vector<int> BinaryTree::postOrderTraversal() 
{
    std::vector<int> list;
    postOrderTraversal(root, list);
    return list;
}

void BinaryTree::postOrderTraversal(Node* tree, std::vector<int>& list) 
{
    if (tree != nullptr) 
    {
        postOrderTraversal(tree->left, list);
        postOrderTraversal(tree->right, list);
        list.push_back(tree->data);
    }
}

std::string BinaryTree::toString(Node* root, int level) 
{
    std::string str = "";
    if (root != nullptr) 
    {
        str += toString(root->right, level + 1);
        str += "\n";
        for (int i = 0; i < level; i++) 
        {
            str += "    ";
        }
        str += std::to_string(root->data);
        str += toString(root->left, level + 1);
    }
    return str;
}

std::string BinaryTree::toString() 
{
    return toString(root, 0);
}

