package com.example.chrisc.bestlineaward;


public class Members {
    String name;
    int leadership;
    double service;
    int fellowship;

    public Members()
    {
        name = "";
        leadership = 0;
        service = 0.0;
        fellowship = 0;
    }

    public Members(String n, int l, double s, int f)
    {
        name = n;
        leadership = l;
        service = s;
        fellowship = f;
    }

    public void setName(String n)
    {
        name = n;
    }

    public void setLeadership(int l)
    {
        leadership = l;
    }

    public void setService(double s)
    {
        service = s;
    }

    public void setFellowship(int f)
    {
        fellowship = f;
    }

    public String getName()
    {
        return name;
    }
    public int getLeadership()
    {
        return leadership;
    }
    public double getService()
    {
        return service;
    }
    public int getFellowship()
    {
        return fellowship;
    }
}
