package com.gridnine.testing.main;

import java.util.List;

public interface Filter {

    List<Flight> filter(List<Flight> flights);
}