// BJ_5639.cpp : 이 파일에는 'main' 함수가 포함됩니다. 거기서 프로그램 실행이 시작되고 종료됩니다.
//

#include <iostream>
using namespace std;

struct Node {
    int value, depth;
    Node* left;
    Node* right;
    Node(const int& _value) : value(_value), depth(0), left(NULL), right(NULL) {}
    void setLeft(Node* newleft) { left = newleft; } //set leftnode
    void setRight(Node* newright) { right = newright; } //set rightnode
};

Node* insert(Node* root, Node* node) { //root값은 이 tree의 대푯값이나 마찬가지
    if (root == NULL) return node;
    if (node->value < root->value) //node의 값이 root의 값보다 작을때 -> left로
        root->setLeft(insert(root->left, node)); //root의 left로 이동해서 반복
    else //node의 값이 root의 값보다 클때 -> right로
        root->setRight(insert(root->right, node));  //root의 left로 이동해서 반복
    return root;
}

void printNode(Node* node) { //후위: 무조건 아래로&그 다음 오른쪽으로
    if (node->left != NULL)
        printNode(node->left);
    if (node->right != NULL)
        printNode(node->right);
    printf("%d\n", node->value);

}

int main() {
    int temp;
    Node* Nodes = NULL;
    while (scanf("%d", &temp) != EOF) { //EOF : 더이상 읽을 값이 없음
        Nodes = insert(Nodes, new Node(temp));
    }
    printNode(Nodes);

}
