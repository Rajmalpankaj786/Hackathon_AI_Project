import React from 'react';
import { useNavigate } from "react-router-dom";
const Navbar: React.FC = () => {
  const navigate = useNavigate();
  return (
    <nav className="px-20 py-4 sticky top-0 " style={{ backgroundColor: 'rgb(44, 19, 56)' }}>
      <div className="container mx-auto flex justify-between items-center">
        <div className="text-white text-2xl font-bold"  onClick={()=>{
            navigate("/")
          }}>Synth AI Interview</div>
        <div className="flex items-center space-x-4">
          <a href="#" className="text-white hover:text-blue-300">Signup</a>
          <a href="#" className="text-white hover:text-blue-300">Login</a>
          <button className="text-white px-4 py-2 rounded"  onClick={()=>{
            navigate("/dashboard")
          }} style={{ backgroundColor: 'rgb(163, 96, 155)' }}>Try for Free</button>
        </div>
      </div>
    </nav>
  );
};

export default Navbar;
