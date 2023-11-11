import React from "react";
import SideMenu from "./SideMenu";
import Card from "./Card";

const Dashboard = () => {
  return (
    <div style={{display:"flex"}}>
      <div className="sidebar" style={{width:"15%"}} >
        <SideMenu />
      </div>
      <div className="main" style={{width:"80%"}} >
        <h1 style={{fontWeight:"bold",fontSize:"38px",textAlign:"start",padding:"10px"}}>Interviews</h1>

      <div style={{width:"90%",display:"grid",gridTemplateColumns:"repeat(3, 1fr)",gridAutoRows:"240px"}} >
      {new Array(8).fill(1).map((el, i) => {
    return (<Card key={i}/>);
})}
       </div>
      </div>
    </div>
  );
};

export default Dashboard;
