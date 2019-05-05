package com.hdu.education.entity.pojo;


public class Result<T>
{
    private String status;
    private T data;
    private String msg;

    public Result(String status, String msg)
    {
        this.status = status;
        this.msg = msg;
    }

    public Result(String status, T data, String msg)
    {
        this.status = status;
        this.data = data;
        this.msg = msg;
    }

    public String getStatus()
    {
        return status;
    }

    public void setStatus(String status)
    {
        this.status = status;
    }

    public T getData()
    {
        return data;
    }

    public void setData(T data)
    {
        this.data = data;
    }

    public String getMsg()
    {
        return msg;
    }

    public void setMsg(String msg)
    {
        this.msg = msg;
    }

    @Override
    public String toString()
    {
        return "Result{" +
                "status='" + status + '\'' +
                ", data=" + data +
                ", msg='" + msg + '\'' +
                '}';
    }
}
