import React from 'react';
import './App.css';
import Navbar from './pages/Navbar';
import AllRoutes from './Routes/AllRoutes';
import Footer from './pages/Footer';


function App() {
  return (
    <div className="App">
      <Navbar />
     <AllRoutes/>
     <Footer />
    </div>
  );
}

export default App;
