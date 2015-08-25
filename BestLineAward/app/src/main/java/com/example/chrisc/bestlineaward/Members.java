package com.example.chrisc.bestlineaward;


public class Members {
    String name;
    Double leadership;
    Double service;
    Double fellowship;
    Double total;
    String status;


    public Members()
    {
        name = "";
        leadership = 0.0;
        service = 0.0;
        fellowship = 0.0;
        total = 0.0;
        status = "";
    }

    public Members(String n, Double l, Double s, Double f, Double t, String st)
    {
        name = n;
        leadership = l;
        service = s;
        fellowship = f;
        total = t;
        status = st;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setLeadership(Double l)
    {
        leadership = l;
    }

    public void setService(Double s)
    {
        service = s;
    }

    public void setFellowship(Double f)
    {
        fellowship = f;
    }

    public void setTotal(Double t)
    {
        total = t;
    }

    public void setStatus(String s)
    {
        status = s;
    }

    public String getName()
    {
        return name;
    }
    public Double getLeadership()
    {
        return leadership;
    }
    public Double getService()
    {
        return service;
    }
    public Double getFellowship()
    {
        return fellowship;
    }
    public Double getTotal()
    {
        return total;
    }

    public String getStatus()
    {
        return status;
    }
}
