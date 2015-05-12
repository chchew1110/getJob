package com.example.chrisc.bestlineaward;


public class Members {
    String name;
    double leadership;
    double service;
    double fellowship;
    double total;
    String status;


    public Members()
    {
        name = "";
        leadership = 0;
        service = 0.0;
        fellowship = 0;
        total = 0;
        status = "";
    }

    public Members(String n, int l, double s, int f, double t, String st)
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

    public void setLeadership(double l)
    {
        leadership = l;
    }

    public void setService(double s)
    {
        service = s;
    }

    public void setFellowship(double f)
    {
        fellowship = f;
    }

    public void setTotal(double t)
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
    public double getLeadership()
    {
        return leadership;
    }
    public double getService()
    {
        return service;
    }
    public double getFellowship()
    {
        return fellowship;
    }
    public double getTotal()
    {
        return total;
    }

    public String getStatus()
    {
        return status;
    }
}
