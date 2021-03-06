import React, { useState, Component, useEffect } from "react";
import {
    Link,
} from "react-router-dom";
import Button from "../components/Button";
import styled, { css } from "styled-components";
import StarRatings from 'react-star-ratings';

function MyRatingView(props) {
  const ratingStyle ={
    'font-size' : '25px',
    margin : '15px'
  }
  const [itemList, setItemList] = useState();

  const ratingListUpdate = ()=>{
    const axios = require('axios');
    const ParamJson = {
        "id":props.userId,
        "password":props.userPassword,
    };
    const url = 'http://localhost:8080/user/my-ratings/'
    try {
    axios.get(url,{
        params:ParamJson,
        headers: {"Content-Type": "Application/json"}
    })
    .then((response) => {
      setItemList(response.data)
      console.log(response.data)
    }).catch((error)=>{
      //alert(error.response);
      console.log(error.response);
    })
    }catch(error){
    console.error(error);
    }
  };
  var i = 0;
  if (itemList != null){
    return (
      <Container {...props}>
        <div style = {{
          'font-size' : '250%',
          'text-align': 'center',
          background : 'lightblue'
        }}>My Rating List</div>
        <ScrollArea>
          {itemList.map(item=>{
            i = i+1;
            return (
              <div
                style={{
                  height: 'auto',
                  'display': 'flex',
                  'flex-direction' : 'row',
                }}
                onClick = {()=>{
                  //props.setItem(itemList[i-1])
                }}
              >
                <div style = {ratingStyle}>{i}.</div>
                <div style = {ratingStyle}>{'<title>'} : {item.movieTitle}</div>
                <div style = {ratingStyle}>rating : </div>
                <StarRatings
                  rating={item.rating}
                  starEmptyColor="lightblue"
                  starRatedColor="rgba(87, 113, 229, 1)"
                  numberOfStars={10}
                  name='rating'/>
              </div>
            )
          }
          )}
        </ScrollArea>
        <Link to="/">
          <Button
          width = '75px'
          height = '35px' 
          text = 'back'/>
        </Link>
      </Container>
    );
  }
  else{
    ratingListUpdate();
    return (
      <Container {...props}>
      <div style = {{
        'font-size' : '250%',
        'text-align': 'center',
        background : 'lightblue'
      }}>My Rating List</div>
      <ScrollArea>
        <div style = {ratingStyle}> No data... </div>
      </ScrollArea>
      <Link to="/">
        <Button
        width = '75px'
        height = '35px' 
        text = 'back'/>
      </Link>
    </Container>);
  }
}

const Container = styled.div`
  display: flex;
  flex-direction: column;
`;
const ScrollArea = styled.div`
  alignSelf: flex-start;
  border-width: 1;
  border-color: lightblue;
  border-style: solid;
  overflow-y: scroll;
  flex : 0.95;
  width : calc(100%-2px);
  flex-direction: column;
  justify-content: flex-start;
  
  display: flex;
`;

export default MyRatingView;
