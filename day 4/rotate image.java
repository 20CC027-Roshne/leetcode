class Solution {
    public void rotate(int[][] matrix) {
for(int i=0,p=matrix.length-1;i<matrix.length/2;i++)
{
for(int j=0;j<matrix[0].length;j++)
{
int temp=0;
temp=matrix[i][j];
matrix[i][j]=matrix[p][j];
matrix[p][j]=temp;
}
p--;
}

    for(int i=0;i<matrix.length;i++)
    {
        for(int j=i;j<matrix[0].length;j++)
        {
            
            
            int temp=0;
            temp=matrix[i][j];
            matrix[i][j]=matrix[j][i];
            matrix[j][i]=temp;    
            
            
        }
    }
}
}
