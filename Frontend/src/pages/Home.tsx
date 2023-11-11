// HomePage.tsx

import React from 'react';
import Footer from './Footer';
const HomePage: React.FC = () => {
  
  return (
    <>
    <div className=" justify-center " style={{ backgroundColor: '#4c3052', color: 'white', padding: '1rem' }}>
      <p className='text-5xl font-bold'>
      Excel in your <br></br> Dream Job Interview 🌟
         
        </p>
      <div className='flex px-6 py-10' style={{margin:"50px", backgroundColor: 'rgb(44, 19, 56)'}}>
        <div>
          <img style={{ width: '800px', height: '300px', borderRadius:"10px" }} src="https://rhoeucl.com/wp-content/uploads/2015/12/careers-800x500.jpg" alt="" />
        </div>
      <div>
      
        <p className='p-10 text-white text-xl font-bold text-left'> Embark on a cutting-edge journey in interview preparation.
          Wave goodbye to outdated  methods and welcome an intelligent,
          streamlined approach to interview readiness,<br></br> powered by AI.</p>
          <p className='p-10 text-left'>
          <button className="text-white px-4 py-2 rounded hover:bg-purple-900 transition-colors duration-300" style={{ backgroundColor: 'rgb(163, 96, 155)' }}>Try for Free</button>
          </p>
      </div>
      </div>
      <p style={{margin : "50px"}} className='text-4xl font-bold'>
      Unlock Your Prime Potential<br></br> Master any interview with these 3 essential strategies!
        </p>
        <div className='flex px-6 py-10' style={{margin:"50px"}}>
        
      <div>
      
        <p className='text-white text-xl font-bold text-left'>Guidance Plan</p>
        <p className='text-white text-l font-bold text-left' style={{marginTop:"20px"}}>Embark on a structured learning journey tailored to various roles or skills. Delve into comprehensive guides to learn, review, or assess your proficiency with ease.</p>
        <p style={{marginTop:"20px"}} className=' text-left'>
        1️⃣ Customized learning journey featuring interactive interviews designed to enhance your chances of success.</p>
          <p style={{marginTop:"20px"}} className='text-left'>
          2️⃣ Elevate your interview preparation with targeted learning resources that provide the expertise needed to excel in your assessments.
        </p>
        <p style={{marginTop:"20px"}} className='text-left'>
         3️⃣ Monitor Your Advancement - Keep Tabs on Your Journey
        </p>
          
      </div>
      <div>
          <img style={{ width: '600px', height: '400px', borderRadius:"10px" }} src="https://static.vecteezy.com/system/resources/previews/011/379/366/non_2x/business-man-running-statistics-vector.jpg" alt="" />
        </div>
      </div>
      <p style={{margin : "50px"}} className='text-4xl font-bold'>
      Insights from Candidates about<br></br> Synth AI Interview
        </p>

      <div className="flex text-center space-x-6 px-6 py-10" style={{margin:"50px"}}>
        <img style={{ width: '325px', height: '400px', borderRadius:"10px" }} src="https://i.postimg.cc/mkJD2XcH/Peach-and-Green-Modern-Simple-Abstract-Garage-Sale-Flyer-7.png" alt="" />
        <img style={{ width: '325px', height: '400px', borderRadius:"10px" }} src="https://i.postimg.cc/mkJD2XcH/Peach-and-Green-Modern-Simple-Abstract-Garage-Sale-Flyer-7.png" alt="" />
        <img style={{ width: '325px', height: '400px', borderRadius:"10px" }} src="https://i.postimg.cc/mkJD2XcH/Peach-and-Green-Modern-Simple-Abstract-Garage-Sale-Flyer-7.png" alt="" />
        <img style={{ width: '325px', height: '400px', borderRadius:"10px" }} src="https://i.postimg.cc/mkJD2XcH/Peach-and-Green-Modern-Simple-Abstract-Garage-Sale-Flyer-7.png" alt="" />
      </div>
      
    </div>
    <Footer />
    </>
  );
};

export default HomePage;
