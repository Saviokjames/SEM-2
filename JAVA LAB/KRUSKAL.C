
#include<conio.h>
#include<stdio.h>
int parent[20];
int find(int i)
{
  i=parent[i];
  return i;
}
int uni(int i,int j)
{
if(i!=j) {
parent[j]=i;
return 1; }
else {
return 0;}
}

int main()
{
 int i,j,vertex;
 int cost_matrix[20][20];
 int edge,count=1,mincost,edge1,edge2,sumcost;
 printf("kruskal         ");
 printf("enter vertex no :   ");
scanf("%d",&vertex);
 printf("enter matrix    ");
 for(i=1;i<=vertex;i++)
 {
 for(j=1;j<=vertex;j++)
 {
 scanf("%d",&cost_matrix[i][j]);
 if(cost_matrix[i][j]==0)
 {
 cost_matrix[i][j]=999;
 }
 }
 }
 edge=vertex-1;
 while(count<edge)
 {
  for(i=1,mincost=999;i<=vertex;i++)
 {
 for(j=1;j<=vertex;j++)
 {
 if(cost_matrix[i][j]<mincost)
 mincost=cost_matrix[i][j];
 edge1=i;
 edge2=j;
 }} }
 i=find(i);
 j=find(j);
 if(uni(i,j))
 {
 printf("edge %d is (%d->%d) with cost :%d",count++,edge1,edge2,mincost) ;
 sumcost+=mincost;
 cost_matrix[i][j]=cost_matrix[j][i];
 printf("sumcoost=%d",sumcost);

 }
 return 0;
 }

















































