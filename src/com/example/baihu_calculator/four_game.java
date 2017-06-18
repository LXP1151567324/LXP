package com.example.baihu_calculator;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class four_game extends Activity{
	double bh[][] = new double[6][4];
    /*
     * baihu[0]:胡子
     * baihu[1]:活鸟
     * baihu[2]:拖鸟
     * baihu[3]:拖鸟比数
     * baihu[4]:活鸟比数
     */
    
    EditText et_hz1;
    EditText et_hz2;
    EditText et_hz3;
    EditText et_hz4;
	
    EditText et_hn1;
    EditText et_hn2;
    EditText et_hn3;
    EditText et_hn4;
	
    EditText et_tn1;
    EditText et_tn2;
    EditText et_tn3;
    EditText et_tn4;

    EditText et_hlb1;
    EditText et_hlb2;
    EditText et_hlb3;
    EditText et_hlb4;
	
    EditText et_tlb1;
    EditText et_tlb2;
    EditText et_tlb3;
    EditText et_tlb4;
	
    EditText et_over;
	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.four_game);//R.layout.activity_main        
        
        et_hz1 = (EditText)findViewById(R.id.et_huzi1);
        et_hz2 = (EditText)findViewById(R.id.et_huzi2);
        et_hz3 = (EditText)findViewById(R.id.et_huzi3);
        et_hz4 = (EditText)findViewById(R.id.et_huzi4);
    	
        et_hn1 = (EditText)findViewById(R.id.et_huoniao1);
        et_hn2 = (EditText)findViewById(R.id.et_huoniao2);
        et_hn3 = (EditText)findViewById(R.id.et_huoniao3);
        et_hn4 = (EditText)findViewById(R.id.et_huoniao4);
    	
        et_tn1 = (EditText)findViewById(R.id.et_tuoniao1);
        et_tn2 = (EditText)findViewById(R.id.et_tuoniao2);
        et_tn3 = (EditText)findViewById(R.id.et_tuoniao3);
        et_tn4 = (EditText)findViewById(R.id.et_tuoniao4);
    	
        et_hlb1 = (EditText)findViewById(R.id.et_hlb1);
        et_hlb2 = (EditText)findViewById(R.id.et_hlb2);
        et_hlb3 = (EditText)findViewById(R.id.et_hlb3);
        et_hlb4 = (EditText)findViewById(R.id.et_hlb4);
    	
        et_tlb1 = (EditText)findViewById(R.id.et_tlb1);
        et_tlb2 = (EditText)findViewById(R.id.et_tlb2);
        et_tlb3 = (EditText)findViewById(R.id.et_tlb3);
        et_tlb4 = (EditText)findViewById(R.id.et_tlb4);
    	
        et_over = (EditText)findViewById(R.id.et_over);
    	
	}
	public void calc(View v)
    {
		double max=0;int m=0;
		String h1=et_hz1.getText().toString().trim(),
	    		   h2=et_hz2.getText().toString().trim(),
	    		   h3=et_hz3.getText().toString().trim(),
	    		   h4=et_hz4.getText().toString().trim();
	    	
	    	//转换成整数
	    	bh[0][0]=Double.parseDouble(h1);
	    	bh[0][1]=Double.parseDouble(h2);
	    	bh[0][2]=Double.parseDouble(h3);
	    	bh[0][3]=Double.parseDouble(h4);
	    	
	    	String n1=et_hn1.getText().toString().trim(),
	     		   n2=et_hn2.getText().toString().trim(),
	     		   n3=et_hn3.getText().toString().trim(),
	     		   n4=et_hn4.getText().toString().trim();
		     	
	     	//转换成整数
	    	bh[1][0]=Double.parseDouble(n1);
	    	bh[1][1]=Double.parseDouble(n2);
	    	bh[1][2]=Double.parseDouble(n3);
	    	bh[1][3]=Double.parseDouble(n4);
		     	
	    	String t1=et_tn1.getText().toString().trim(),
	     		   t2=et_tn2.getText().toString().trim(),
	     		   t3=et_tn3.getText().toString().trim(),
	     		   t4=et_tn4.getText().toString().trim();
	     	
	     	//转换成整数
	    	bh[2][0]=Double.parseDouble(t1);
	    	bh[2][1]=Double.parseDouble(t2);
	    	bh[2][2]=Double.parseDouble(t3);
	    	bh[2][3]=Double.parseDouble(t4);
	     	
	    //计算拖鸟	
     	for(int i=0;i<bh[0].length;i++)
     	{
     		double s=0;
     		for(int j=0;j<bh[0].length;j++)
     	     	{
     				if(bh[0][i]>bh[0][j])
     				{
     					s=bh[2][i]+bh[2][j];
     				}
     				
     				else if(bh[0][i]==bh[0][j])
     				{
     					s=0;
     				}
     				
     				else if(bh[0][i]<bh[0][j])
     				{
     					s=0-(bh[2][i]+bh[2][j]);
     				}
     				
     				bh[3][i]+=s;    					
     	     	}
     	}
     	
     	et_tlb1.setText(bh[3][0]+"");
     	et_tlb2.setText(bh[3][1]+"");
     	et_tlb3.setText(bh[3][2]+"");
     	et_tlb4.setText(bh[3][3]+"");
     	
     	//进行四舍五入
     	for(int i =0;i<bh[0].length;i++)
     	{
     			if(bh[0][i]>0)
     			{
     				if(bh[0][i]%10>=5)
     				{
     					bh[0][i]=(int)(bh[0][i]/10+1)*10;     			
     				}
	     			else
	         		{
	         			bh[0][i]=(int)bh[0][i]/10*10;
	         		}
     			}
     			else if(bh[0][i]<0 && bh[0][i]%10<=-5)
     			{
     				bh[0][i]=(int)(bh[0][i]/10-1)*10;
     			}     			
     	}
//    	et_hz1.setText(bh[0][0]+"");
//     	et_hz2.setText(bh[0][1]+"");
//     	et_hz3.setText(bh[0][2]+"");
//     	et_hz4.setText(bh[0][3]+"");
     	
      	
	    //计算活鸟	
     	for(int i=0;i<bh[0].length;i++)
     	{
     		double c=0;
     		for(int j=0;j<bh[0].length;j++)
     	     	{
     				
 					c =bh[0][i]-bh[0][j];
 					bh[4][i]+=c*0.5*(bh[1][i]+1)*(bh[1][j]+1);
 					    				
     	     	}
     	}
     	
     	et_hlb1.setText(bh[4][0]+"");
    	et_hlb2.setText(bh[4][1]+"");
     	et_hlb3.setText(bh[4][2]+"");
     	et_hlb4.setText(bh[4][3]+"");
     	
     	//比输赢
     	for(int i=0;i<bh[0].length;i++)
     	{
     		bh[5][i]=bh[4][i]+bh[3][i];
     	}
     	for(int i=0;i<bh[0].length;i++)
     	{
     		for(int j=0;j<bh[0].length;j++)
     		{
     			if(bh[5][j]>bh[5][i])
     			{
     				max=bh[5][j];
     				m=j;
     			}
     		}
     	}
     	switch(m)
     	{
     		case 0:et_over.setText("玩家1是赢家");break;
     		case 1:et_over.setText("玩家2是赢家");break;
     		case 2:et_over.setText("玩家3是赢家");break;
     		case 3:et_over.setText("玩家4是赢家");break;
     	}
     	
     	
    }
	
	public void back(View v)
    {
    	Intent intent = new Intent(this,MainActivity.class);
    	startActivity(intent);
    }
    
}