import { useState } from 'react';
import { FaDesktop } from 'react-icons/fa';
import { BiLogInCircle,BiExclude } from 'react-icons/bi';

export default function SideMenu(): JSX.Element {
  const [selectedKeys, setSelectedKeys] = useState('dashboard');

  const handleSelector = (key: string) => {
    setSelectedKeys(key);
  };

  return (
  
      <div 
      className={'flex p-10 flex-col justify-between h-screen shadow-md'}
      // style={{display:'flex',padding:"10px", flexDirection:"column",justifyContent:"space-between",height:"100vh" ,boxShadow:"rgba(0, 0, 0, 0.05) 0px 0px 0px 1px"}}
    
      >
        <div>
        <div
          className={`flex items-center p-4 cursor-pointer text-xl font-bold ${selectedKeys === 'dashboard' ? 'bg-[#e3f2fd] text-blue-500' : ''}`}
          onClick={() => handleSelector('dashboard')}
        >
          <div className="mr-2">
            <FaDesktop />
          </div>
          <span>Dashboard</span>
        </div> 
        <div
          className={`flex items-center p-4 cursor-pointer text-xl font-bold ${selectedKeys === 'about' ? 'bg-[#e3f2fd] text-blue-500' : ''}`}
          onClick={() => handleSelector('about')}
        >
          <div className="mr-2">
            <BiExclude />
          </div>
          <span>About</span>
        </div> 
        </div>
        <div
          className={`flex items-center p-4 cursor-pointer text-xl font-bold ${selectedKeys === '/' ? 'bg-[#e3f2fd] text-blue-500' : ''}`}
          onClick={() => handleSelector('/')}
        >
          <div className="mr-2">
            <BiLogInCircle />
          </div>
          <span>Logout</span>
        </div>
      </div>
  
  );
}
