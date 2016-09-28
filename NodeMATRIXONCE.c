  #include<stdio.h>
 
int matrix[25][25], node1[10], l, c1 = 0;
 
int tsp(int c)
{
 int count, node = 999;
 int minimum = 999, temp;
 for(count = 0; count < l; count++)
 {
 if((matrix[c][count] != 0) && (node1[count] == 0))
 {
 if(matrix[c][count] < minimum)
 {
 minimum = matrix[count][0] + matrix[c][count];
 }
 temp = matrix[c][count];
 node = count;
 }
 }
 if(minimum != 999)
 {
 c1 = c1 + temp;
 }
 return node;
}
 
void minimum_c1(int c)
{
 int node;
 node1[c] = 1;
 printf("%d ", c + 1);
 node = tsp(c);
 if(node == 999)
 {
 node = 0;
 printf("%d", node + 1);
 c1 = c1 + matrix[c][node];
 return;
 }
 minimum_c1(node);
}
 
int main()
{ 
 int i, j;
 printf("Enter Number of NOdes\t");
 scanf("%d", &l);
 printf("\nEnter  Matrix1\n");
 for(i = 0; i < l; i++)
 {
 printf("\nEnter %d Elements in Row[%d]\n", l, i + 1);
 for(j = 0; j < l; j++)
 {
 scanf("%d", &matrix[i][j]);
 }
 node1[i] = 0;
 }
 printf("\nEntered Cost Matrix2\n");
 for(i = 0; i < l; i++)
 {
 printf("\n");
 for(j = 0; j < l; j++)
 {
 printf("%d ", matrix[i][j]);
 }
 }
 printf("\n\Node touched only once:\t");
 minimum_c1(0);

 return 0;
}