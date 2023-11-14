import React from "react";
import { FaDesktop } from "react-icons/fa";
import { AiOutlineClockCircle } from "react-icons/ai";
interface InterviewCardProps {
  name: string;
}
const Card:React.FC<InterviewCardProps>= ({name}) => {
  return (
    <div className="border border-gray-300 rounded-lg p-4 m-4 flex flex-col justify-between">
      <div className="flex items-center mb-2">
        <div className="flex items-center justify-center rounded-full p-3 mr-3 bg-[#e3f2fd]">
          <FaDesktop  size="2.5em" color="#64b5f6"/>
        </div>
        <div>
          <h1 className="text-xl">{name}</h1>
          <p className="text-base text-gray-700 text-left">General</p>
        </div>
      </div>
      <div className="flex items-center mb-2">
        <div className="mr-2 flex items-center bg-[#e0f2f1] p-0.5 pl-2 pr-2 rounded-lg text-[#26a69a]">
          <i className="fas fa-clock text-blue">
            <AiOutlineClockCircle />
          </i>
          <p className="ml-1">30 Min</p>
        </div>
        <p className="ml-2 text-gray-700 bg-[#e3f2fd] rounded-lg p-0.5 pl-2 pr-2">New</p>
      </div>
      <button className="bg-[#7c68bb] text-white border-none rounded-lg px-4 py-2 cursor-pointer w-40">
      VIEW REPORT
      </button>
    </div>
  );
};

export default Card;
