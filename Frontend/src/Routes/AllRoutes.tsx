import React from "react";
import { Routes, Route } from "react-router-dom";
import HomePage from "../pages/Home";
import Dashboard from "../components/Dashboard";

const AllRoutes = () => {
  return (
    <Routes>
      <Route path="/" element={<HomePage />}/>
      <Route path="/dashboard" element={<Dashboard/>}/>
    </Routes>
  );
};

export default AllRoutes;
